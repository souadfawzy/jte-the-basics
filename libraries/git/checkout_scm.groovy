void call(devbranch){
    stage("Git: SCM Checkout"){
        println "source checkout ${devbranch.branch}"
        println "url ${devbranch.url}"
    //     checkout([
    //     $class: 'GitSCM'
    //     doGenerateSubmoduleConfigurations: false, 
    //     branches: [[name:  'master' ]],
    //     userRemoteConfigs: [[ url: 'https://github.com/souadfawzy/emirateairline-todo.git' ,credentialsId : 'git_cred']]
    // ])
    } 
    
}

// def call(){
//     node{
//         checkout(
//             changelog:true,
//             poll: true,
//             scm: [
//                 $class: 'GitSCM',
//                 branches: [[name: "*/${config.branch}"]],
//             doGenerateSubmoduleConfigurations: false,
//             extensions: [
//                 [$class: 'CheckoutOption', timeout: 10],
//                 [$class: 'CloneOption', noTags: false, reference: '', timeout: 10]],
//             submoduleCfg: [],
//             userRemoteConfigs: [[url: config.url, credentialsId: config.cred]]]
//         )
//         sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
//     }
// }