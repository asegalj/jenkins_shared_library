#!groovy

def call(a) {
    echo "Hello World $a"
    def auditTools = auditTools()
}

def auditTools() {
    echo 'test'
//   sh '''
//        git version
//        dotnet --list-sdks
//        dotnet --list-runtimes
//     '''
}

