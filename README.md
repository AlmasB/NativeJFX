# NativeJFX
A demo app that uses maven jfx plugin and other tools to generate native executables and installers

# Building native bundles (Windows)
<ol>
<li>Install <a href="http://www.jrsoftware.org/isdl.php">Inno Setup</a> 5.5.6+</li>
<li>Install <a href="http://wixtoolset.org/">Wix</a> 3.1.0+</li>
<li>Add both programs to PATH</li>
<li>Run <code>mvn package</code></li>
</ol>

<b>Note:</b> it may take up to a few minutes to produce launchers and bundle with JRE.
