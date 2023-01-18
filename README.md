To reproduce:

```
$ ./gradlew build

FAILURE: Build failed with an exception.

* What went wrong:
Could not determine the dependencies of task ':compileCommonMainKotlinMetadata'.
> Could not resolve all dependencies for configuration ':allSourceSetsCompileDependenciesMetadata'.
   > Consumable configurations with identical capabilities within a project (other than the default configuration) must have unique attributes, but configuration ':debugFrameworkIosFat' and [configuration ':debugFrameworkIosArm64'] contain identical attribute sets. Consider adding an additional attribute to one of the configurations to disambiguate them.  Run the 'outgoingVariants' task for more details. See https://docs.gradle.org/8.0-rc-2/userguide/upgrading_version_7.html#unique_attribute_sets for more details.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 368ms

```

Uncomment the lines in `build.gradle.kts` for a workaround