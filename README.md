# Library Management System (Java / Maven) — SEC321L Lab 05

This is a compact runnable Java/Maven project for practicing Git fundamentals.

## Run
Requires JDK 11+ and Maven:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.hitms.lms.App"
```
If the exec plugin is not configured locally, run `com.hitms.lms.App` from your IDE after importing the Maven project.

## Lab 05 tasks
1. `.gitignore` excludes Maven build output and common IDE files.
2. `LibraryService` supports adding and finding books and members by ID.
3. Create a feature branch and merge it into `main`.
4. View commit history with `git log --oneline`.
5. Create your own GitHub repository and push the commits.

## Suggested Git workflow
Run these commands in the extracted project folder:
```bash
git init
git branch -M main
git add .
git commit -m "Initial commit: add LMS project and gitignore"
git checkout -b feature/add-member-lookup
git add .
git commit -m "Add findMemberById helper method"
git checkout main
git merge feature/add-member-lookup
git log --oneline
```
For a third commit, make a real small change (for example, improve README documentation), then:
```bash
git add README.md
git commit -m "Document LMS setup and Git workflow"
```
Only use these commands as a fresh workflow in a repository that has not already been initialized. Commit history is created on your own computer when you run the commands; this ZIP does not contain a pre-made Git history or GitHub link.

## GitHub push
Create an empty repository on GitHub, then replace YOUR-USERNAME:
```bash
git remote add origin https://github.com/YOUR-USERNAME/lms_project.git
git push -u origin main
```
## Features
- Add and manage books and members
- Search for a member by ID
- Java-based Library Management System