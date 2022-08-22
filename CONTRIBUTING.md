# Contributing to `twiml-kotlin`

We welcome contributions to `twiml-kotlin`. Here are the guidelines we'd like you to follow:

- [Code of Conduct](#coc)
- [Question or Problem?](#question)
- [Issues and Bugs](#issue)
- [Feature Requests](#feature)
- [Documentation fixes](#docs)
- [Submission Guidelines](#submit)
- [Coding Rules](#rules)


## <a name="coc"></a> Code of Conduct

Please be kind to and considerate of other developers, as we all have the same goal: make `twiml-kotlin` as good as it can be.

## <a name="question"></a> Have a Question or Problem?

If you have questions about how to use `twiml-kotlin`, please see our
README, and if you don't find the answer there, please contact
[opensource_team@iptiq.com](mailto:opensource_team@iptiq.com) with any issues you have.

## <a name="issue"></a> Found an Issue?

If you find a bug in the source code or a mistake in the documentation, you can
help us by submitting [an issue][issue-link]. 

You can help us out even more by submitting a pull request with a fix.

If the file in which the error exists begins with this comment:
```
Generated using com.iptiq:twiml-kotlin-code-generation
```
then it is a generated file and the change will need to be made in the `twiml-kotlin-code-generation` module. 

**Please see the [Submission Guidelines](#submit) below.**

## <a name="feature"></a> Want a Feature?

You can request a new feature by submitting an issue to our
[GitHub Repository][github]. If you would like to implement a new feature then
consider what kind of change it is:

* **Major Changes** that you wish to contribute to the project should be
  discussed first with `twiml-kotlin` contributors in an issue or pull request so
  that we can develop a proper solution and better coordinate our efforts,
  prevent duplication of work, and help you to craft the change so that it is
  successfully accepted into the project.
* **Small Changes** can be crafted and submitted to the
  [GitHub Repository][github] as a Pull Request.

## <a name="submit"></a> Submission Guidelines

### Submitting an Issue
Before you submit your issue search the archive, maybe your question was already
answered.

If your issue appears to be a bug, and hasn't been reported, open a new issue.
Please avoid reporting duplicate issues. Providing the following information
will increase the chances of your issue being dealt with quickly:

* **Overview of the Issue** - if an error is being thrown a stack trace helps
* **Motivation for or Use Case** - explain why this is a bug for you
* **`twiml-kotlin` Version(s)** - is it a regression?
* **Reproduce the Error** - provide an isolated code snippet or an unambiguous
  set of steps.
* **Related Issues** - has a similar issue been reported before?
* **Suggest a Fix** - if you can't fix the bug yourself, perhaps you can point
  to what might be causing the problem (line of code or commit)

### Submitting a Pull Request
Before you submit your pull request consider the following guidelines:

* Search [GitHub][github] for an open or closed Pull Request that relates to
  your submission. You don't want to duplicate effort.
* Make your changes in a new git branch:

    ```shell
    git checkout -b my-fix-branch main
    ```

* Create your patch, **including appropriate test cases**.
* Follow our [Coding Rules](#rules).
* Run the full `twiml-kotlin` test suite (aliased by `make test`), and ensure
  that all tests pass.
* Commit your changes using a descriptive commit message.

    ```shell
    git commit -a
    ```
  Note: the optional commit `-a` command line option will automatically "add"
  and "rm" edited files.

* Build your changes locally to ensure all the tests pass:

    ```shell
    make test
    ```

* Push your branch to GitHub:

    ```shell
    git push origin my-fix-branch
    ```

In GitHub, send a pull request to `twiml-kotlin:main`.
If we suggest changes, then:

* Make the required updates.
* Re-run the `twiml-kotlin` test suite to ensure tests are still passing.
* Commit your changes to your branch (e.g. `my-fix-branch`).
* Push the changes to your GitHub repository (this will update your Pull Request).

That's it! Thank you for your contribution!

#### After your pull request is merged

After your pull request is merged, you can safely delete your branch and pull
the changes from the main (upstream) repository.

## <a name="rules"></a> Coding Rules

To ensure consistency throughout the source code, keep these rules in mind as
you are working:

* The [Kotlin code conventions][code-conventions] should be followed.
* All features or bug fixes **must be tested** by one or more tests.
* All classes and methods **must be documented**.


[issue-link]: https://github.com/iptiq/iptiq-twiml-kotlin/issues/new
[github]: https://github.com/iptiq/iptiq-twiml-kotlin
[code-conventions]: https://kotlinlang.org/docs/coding-conventions.html