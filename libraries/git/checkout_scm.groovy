void call(devbranch){
     node{
    stage("Git: SCM Checkout"){
        println "source checkout ${devbranch.branch}"
        println "url ${devbranch.url}"
        checkout([
        $class: 'GitSCM', 
        branches: [[name: "${devbranch.branch}"]], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [[$class: 'SubmoduleOption', disableSubmodules: false, parentCredentials: false,recursiveSubmodules: true, reference: '', trackingSubmodules: false]], 
        gitTool: 'Default',  
        submoduleCfg: [], 
        userRemoteConfigs: [[
        credentialsId: "${devbranch.git_cred}", 
        url: "${devbranch.url}"]]])
    }
     }
}
        