def call() {
    node {
        df auditTools = auditTools()
    }
    
def auditTools(){
        sh '''
            git version
            dotnet --list-sdks
            dotnet --list-runtimes
        '''
    }

