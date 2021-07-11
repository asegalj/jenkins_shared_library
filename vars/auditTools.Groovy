def call() {
    node {
        df auditTools = auditTools()
    }
    
def auditTools(){
    echo "test"
     //   sh '''
    //        git version
    //        dotnet --list-sdks
    //        dotnet --list-runtimes
   //     '''
    }

