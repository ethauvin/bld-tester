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

        scope(compile)
                .include(dependency("net.thauvin.erik:bitly-shorten:0.9.4-SNAPSHOT"));
        scope(runtime)
                .include(dependency("net.thauvin.erik:bitly-shorten:0.9.4-SNAPSHOT"));
        scope(test)
                .include(dependency("org.junit.jupiter", "junit-jupiter", version(5, 9, 2)))
                .include(dependency("org.junit.platform", "junit-platform-console-standalone", version(1, 9, 2)));
    }

    public static void main(String[] args) {
        new BldTesterBuild().start(args);
    }
}
