void call(docker){
    node{
    stage("Docker: push image to DTR"){

    println "push image to DTR"
    docker.build registry + ":${docker.BUILD_NUMBER}"

    //sh 'mvn -pl journey-services -DskipTests dockerfile:push@push-latest'
    //sh 'mvn -pl journey-services -DskipTests dockerfile:push@push-version'

    //sh 'mvn -pl confsrv -DskipTests dockerfile:push@push-latest'
    //sh 'mvn -pl confsrv -DskipTests dockerfile:push@push-version'
    }
    }
}