define(["app"], function(app){
	app.service('municipioService', ['$http', function ($http) {
        
		this.listarMunicipios = function(uf){
        	return $http.get('/ProjetoMaisVida/municipio/listarMunicipios/'+uf);
        };
        
	}]);
});