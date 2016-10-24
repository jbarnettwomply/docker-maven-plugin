package io.fabric8.maven.docker;

import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Run Mojo that forks the maven lifecycle
 */
@Mojo(name = "run-fork", defaultPhase = LifecyclePhase.PRE_INTEGRATION_TEST)
@Execute(phase = LifecyclePhase.INITIALIZE)
public class RunForkMojo extends RunMojo {
}
