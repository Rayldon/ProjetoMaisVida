define([
	"app", 
	"../../../medico/medicoService",
	"../../../uf/ufService",
	"../../../municipio/municipioService",
	"../../../js/filters",
	"../../../js/directives"
], function(app){
	app.controller('medicoController', ['$scope','medicoService','ufService','municipioService',
		function($scope, medicoService, ufService, municipioService){
			$scope.status = "";
			$scope.uf = "";
			$scope.municipio = "";
			$scope.ativo = true;
			$scope.especialidade = "";
			$scope.primeiroNome = "";
			$scope.ultimoNome = "";
			$scope.email = "";
			$scope.senha = "";
			$scope.confirmSenha = "";
			
			
			//Carregar UF's
			ufService.listarTodas()
			.then(function (response){
                $scope.ufs = response.data;
            },function (error){
                $scope.msg = 'Unable to load customer data: ' + error.message;
            });
			
			//Carregar Municipios's
			$scope.listarMunicipios = function(){
				municipioService.listarMunicipios($scope.uf)
				.then(function (response){
	                $scope.municipios = response.data;
	            },function (error){
	                $scope.msg = 'Unable to load customer data: ' + error.message;
	            });
			}
			
			$scope.salvar = function(){
				if(validarCampos()){
					dados = {
						'primeiroNome':$scope.primeiroNome,
						'ultimoNome':$scope.ultimoNome,
						'email':$scope.email,
						'senha':$scope.senha,
						'status':$scope.status,
						'uf':$scope.uf,
						'municipio':$scope.municipio,
						'ativo':$scope.ativo,
						'especialidade':$scope.especialidade
					}
					medicoService.salvar(dados)
					.then(function (response){
		                $scope.success = response.data.msg;
		            },function (error){
		                $scope.error = 'Unable to load customer data: ' + error.message;
		            });
				}
			}
			
			function validarCampos(){
				if($scope.primeiroNome == ""){
					alert("Informe o primeiro nome");
					return false;
				}else if($scope.ultimoNome == ""){
					alert("Informe o último nome");
					return false;
				}else if($scope.especialidade == ""){
					alert("Informe a especialidade");
					return false;
				}else if($scope.email == ""){
					alert("Informe o email");
					return false;
				}else if($scope.status == ""){
					alert("Informe o status");
					return false;
				}else if($scope.senha == ""){
					alert("Informe a senha");
					return false;
				}else if($scope.confirmSenha == ""){
					alert("Informe a confirmação da senha");
					return false;
				}else if($scope.confirmSenha != $scope.senha){
					alert("Senhas não conferem");
					return false;
				}else if($scope.uf == ""){
					alert("Informe o estado");
					return false;
				}else if($scope.municipio == ""){
					alert("Informe o município");
					return false;
				}
				return true;
			}
			
			//Carregar Médicos
			medicoService.listarMedicos()
			.then(function (response){
                $scope.medicos = response.data;
            },function (error){
                $scope.error = 'Unable to load customer data: ' + error.message;
            });
			
			$scope.situacao = function(situacao){
				if(situacao == 1){
					return "Ocupado";
				}else{
					return "Disponível";
				}
			}
		}
	]);
});