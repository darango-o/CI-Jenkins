# CI-Jenkins
This is a small project to experiment with jenkins.

The main purpose is to unified the concept of Continuous Integration with Jenkins along with the GitHub plugin to test every commit that is pushed to the repository automatically.

## How to make it work?
The first thing is to have jenkins installed on the machine. After that create a new pipeline and check the following options: ![screencapture-localhost-8082-job-CI-Jenkins-configure-2023-08-31-21_29_28](https://github.com/darango-o/CI-Jenkins/assets/141787880/a876dfa9-408f-49fd-8724-ca32b7b89ba5)

the next step is to paste the PipelineScript.txt in the pipeline Script section.
Click on _apply_, then _save_ and there you have it! Now you can test this little project by yourself.
Click on Build and you can see the pipeline doing its magic.

### Before Push

![screencapture-localhost-8082-job-CI-Jenkins-26-console-2023-08-31-21_13_09](https://github.com/darango-o/CI-Jenkins/assets/141787880/7dd433f5-f0a0-40bb-b280-f6aec049b6d0)

### After Push

![screencapture-localhost-8082-job-CI-Jenkins-28-console-2023-08-31-21_22_29](https://github.com/darango-o/CI-Jenkins/assets/141787880/269d0f92-3446-40f7-a363-a6a04c04d7bf)


## What does the java program do?
It's very simple, it search for a environmental variable to print it and then prints its length.
