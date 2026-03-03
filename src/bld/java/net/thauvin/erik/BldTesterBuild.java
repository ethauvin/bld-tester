package net.thauvin.erik;

import rife.bld.Project;
import rife.bld.dependencies.Repository;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.*;

public class BldTesterBuild extends Project {
    public BldTesterBuild() {
        pkg = "net.thauvin.erik";
        name = "BldTester";
        mainClass = "net.thauvin.erik.BldTesterMain";
        version = version(0, 1, 0);

        javaRelease = 17;

        downloadSources = true;

        repositories = List.of(MAVEN_CENTRAL, RIFE2_RELEASES,
                new Repository("https://oss.sonatype.org/content/repositories/snapshots/"));

        var junit = version(6, 0, 3);
        scope(compile)
                .include(dependency("net.thauvin.erik:bitly-shorten:2.0.0"));
        scope(runtime)
                .include(dependency("net.thauvin.erik:bitly-shorten:2.0.0"));
        scope(test)
                .include(dependency("org.junit.jupiter", "junit-jupiter", junit))
                .include(dependency("org.junit.platform", "junit-platform-console-standalone", junit));
    }

    public static void main(String[] args) {
        new BldTesterBuild().start(args);
    }
}
