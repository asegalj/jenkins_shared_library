def call() {
    echo "WHY ARE YOU CALLING THIS FUNCTION!??!"
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

