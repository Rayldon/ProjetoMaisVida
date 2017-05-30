define(["app"], function(app){
	app.service('ufService', ['$http', function ($http) {
        
		this.listarTodas = function(){
        	return $http.get('/ProjetoMaisVida/uf/listarTodas');
        };
        
	}]);
});