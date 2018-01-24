package steps

/**
 * Created by guru on 21/11/17.
 */

import geb.Browser
import geb.binding.BindingUpdater

import static cucumber.api.groovy.Hooks.After
import static cucumber.api.groovy.Hooks.Before

def bindingUpdater
Before() {
//    def binding = new Binding() // don't use like this...it doesn't work..
    bindingUpdater = new BindingUpdater(binding, new Browser())
    bindingUpdater.initialize()
}

After() {
    bindingUpdater.remove()
}