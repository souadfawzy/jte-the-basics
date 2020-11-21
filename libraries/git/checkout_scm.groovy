void call(){
        print scmConfig.branch
    
    checkout([
        $class: 'GitSCM'
        doGenerateSubmoduleConfigurations: false, 
        branches: [[name:  scmConfig.branch ]],
        userRemoteConfigs: [[ url: scmConfig.url ,credentialsId : scmCheckout.credentialsId]]
    ])

}