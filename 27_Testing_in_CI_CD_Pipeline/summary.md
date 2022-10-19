# (27)_27_Testing_in_CI_CD_Pipeline

## Introduction CI/CD
 A. Continuous Integration (CI)
  - Practice of integrating code into a shared repository and building/testing each change automatically, as early as possible - usually several ties a day
  - Best achieved through integration with version control
 B. Continuous Delivery / Deployment (CD)
  - Adds that the software can be released to production at any time, often by automatically pushing changes to a staging system.
  - CD goes further and pushes changes to production automatically.
 C. What Makes Good CI/CD?
  - Decoupled Stages => Setiap step dalam CI should do single focused task.
  - Repeatable => Automated in a way that is consistently repeatable & Tooling should work for local developers too
  - Fail Fast => Fail at the first sign of trouble
  - Design with system in mind => Cover as many part of a deployment as posible, such as: Application, Infrastructure, Config, Data
  - Pipelines => Continually increase confidence as you move towards production
  - Globally Unique version => Know the state of the system at any time & be able to demonstrate difference between current and future state
 D. CI/CD Process
  - Commit -> Build -> Test -> Deploy
 E. CI/CD Tools
  - Jenkins         - Circleci
  - Bamboo          - AWS CodeBuild
  - Azure DevOps    - CI/CD
  - Travis CI       - GitHub Actions
  

