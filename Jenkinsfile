node {    
      
            stage ('SCM Checkout') {  
                git 'https://github.com/ravivkiran888/my-app'  
            }  

            stage ('Compile-Package') {  

            def mvnhome =  tool name: 'maven-3', type: 'maven'
                  
                sh "${mvnhome}/bin/mvn package"  
            }  

            
}
