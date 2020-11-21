void call(){
    stage("Git: SCM Checkout"){
        println "source checkout"
        checkout([
        $class: 'GitSCM'
        doGenerateSubmoduleConfigurations: false, 
        branches: [[name:  'master' ]],
        userRemoteConfigs: [[ url: 'https://github.com/souadfawzy/emirateairline-todo.git' ,credentialsId : 'git_cred']]
    ])
    } 
    
}