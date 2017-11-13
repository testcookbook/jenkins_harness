import utilities.CommonConfig

job = freeStyleJob('Example1') {
    steps {
        shell('ls')
    }
}

CommonConfig.gitConfig(job)