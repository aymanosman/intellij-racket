## Verify the plugin

```sh
./gradlew clean test buildPlugin verifyPlugin
```

The plugin ZIP is created in `build/distributions/`. Before publishing, install it in a supported IDE using **Settings | Plugins | Install Plugin from Disk**.

## Publishing prerequisites

The following ignored files must exist:

```text
certificate/chain.crt
certificate/private.pem
```

Set the required credentials in the current shell:

```sh
export PRIVATE_KEY_PASSWORD='<private-key password>'
export PUBLISH_TOKEN='<JetBrains Marketplace token>'
```

## Publish a release

1. Set a new, unique `pluginVersion` in `gradle.properties`.
2. Add the release notes under `## Unreleased` in `CHANGELOG.md`.
3. Verify and smoke-test the plugin.
4. Publish it:

   ```sh
   ./gradlew publishPlugin
   ```

`publishPlugin` patches the changelog, builds and signs the plugin, and uploads it to JetBrains Marketplace. Review and commit the resulting `CHANGELOG.md` change after the upload succeeds.

Finally, confirm the new version and compatibility range on the [Racket plugin page](https://plugins.jetbrains.com/plugin/14752-racket). Compatibility is taken from the uploaded plugin artifact, so changing it requires publishing a new version.

See JetBrains' documentation for [publishing](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html) and [signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html).
