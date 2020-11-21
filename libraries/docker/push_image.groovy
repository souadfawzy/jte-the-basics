void call(docker){
    node{
    stage("Docker: push imae to DTR"){

       println "push image to DTR"
      docker.build registry + ":${docker.BUILD_NUMBER}"

    }
    }
}