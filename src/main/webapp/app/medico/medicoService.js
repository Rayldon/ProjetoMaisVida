define(["app"], function(app){
	app.service('medicoService', ['$http', function ($http) {
        
		this.salvar = function(params){
        	return $http({
        	    method: 'POST',
        	    url: '/ProjetoMaisVida/medico/salvar',
        	    headers: {
        	        'Content-Type': 'application/json',
        	        'Accept': 'application/json'
        	    },
        	    data:params
        	})
        };
        
        this.listarMedicos = function(params){
        	return $http.get('/ProjetoMaisVida/medico/listarMedicos');
        };
        
	}]);
});