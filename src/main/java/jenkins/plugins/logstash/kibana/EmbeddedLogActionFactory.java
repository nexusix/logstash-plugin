/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins.plugins.logstash.kibana;

import hudson.Extension;
import hudson.model.Action;
import hudson.model.Run;
import java.util.Arrays;
import java.util.Collection;
import jenkins.model.TransientActionFactory;
import jenkins.plugins.logstash.util.UniqueIdHelper;

/**
 * Produces Browsing links for the plugin.
 * @author Oleg Nenashev
 * @see KibanaEmbeddedLogAction
 */
@Extension
public class EmbeddedLogActionFactory extends TransientActionFactory<Run> {

    @Override
    public Class<Run> type() {
        return Run.class;
    }

    @Override
    public Collection<? extends Action> createFor(Run target) {
        return Arrays.<Action>asList(new KibanaEmbeddedLogAction(target), 
                new ElasticsearchIncrementalLogAction(target));
    }
    
}
