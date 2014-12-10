package com.jbehave.spring;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

/**
 * Created by serhii on 08.12.14.
 */
@RunWith(SpringAnnotatedEmbedderRunner.class)
@Configure()
@UsingEmbedder(embedder = Embedder.class,
        generateViewAfterStories = true,
        ignoreFailureInStories = true,
        ignoreFailureInView = true)
//@ContextConfiguration(locations = {"classpath:jbehave/configuration.xml", "classpath:steps/salary-steps.xml"})
@UsingSpring(resources = { "jbehave/configuration.xml",
        "steps/salary-steps.xml" })
public class MyTestRunner extends InjectableEmbedder {

    @Test
    public void run() {
        injectedEmbedder().runStoriesAsPaths(storyPaths());
    }

    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(),asList("**/*.story"), null);
    }

}
