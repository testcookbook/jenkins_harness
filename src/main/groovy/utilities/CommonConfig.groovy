package utilities

import javaposse.jobdsl.dsl.Job

class CommonConfig {

    static void gitConfig(Job job) {
        job.with {
            scm {
                git {
                    remote {
                        name('origin')
                        url('https://github.com/yourorg/yourproject.git')
                    }
                    branches('master')
                    extensions {}
                }
            }
            triggers {
                githubPush()
            }
        }
    }
}
