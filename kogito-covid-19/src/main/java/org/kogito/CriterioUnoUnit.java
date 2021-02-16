package org.kogito;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataStream;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.SingletonStore;

public class CriterioUnoUnit implements RuleUnitData {
    DataStore<Sintoma> sintomas = DataSource.createStore();
    DataStream<Criterio> criterios = DataSource.createStream();
    SingletonStore<Boolean> casoSospechoso = DataSource.createSingleton();

    public DataStore<Sintoma> getSintomas() {
        return sintomas;
    }

    public DataStream<Criterio> getCriterios() {
        return criterios;
    }

    public SingletonStore<Boolean> getCasoSospechoso() {
        return this.casoSospechoso;
    }

}
