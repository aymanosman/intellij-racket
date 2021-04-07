package org.racket.ide.settings

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil

@State(
        name = "org.racket.ide.settings.RacketSettings",
        storages = [Storage("RacketSettings.xml")]
)
class RacketSettings: PersistentStateComponent<RacketSettings> {
    var racketPath: String = ""

    override fun getState(): RacketSettings {
        return this
    }

    override fun loadState(state: RacketSettings) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object {
        fun getInstance(): RacketSettings {
            return ServiceManager.getService(RacketSettings::class.java)
        }
    }
}
