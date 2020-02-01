pipelineJob('Blog DB Backup'){
    definition{
        cpsScm {
            scm {
                github('reinka/jenkinsfiles', 'master')
            }
            scriptPath("blogBackup.groovy")
        }
    }
}
