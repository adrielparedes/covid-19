# Argentina COVID-19 Example

## Suspect Case Protocol

### First Case

Anyone of any age with two or more of the following symptoms:

- Fever (37.5°C or more)
- Cough
- Odynophagia
- Respiratory Distress
- Anosmia/Dysgeusia
- Headache
- Diarrhea and/or vomits

_This criterion includes all severe acute respiratory disease without another etiology that fully explains the clinical presentation._

### Second Case

Anyone who:

- Be a health worker
- Lives or works in a closed or long-term internment institution
- Be essential staff
- Lives in slum neighborhoods
- Be a close contact of a detected covid case
- Has one or more of the following symptoms:
  - fever (37.5°C or more)
  - cough
  - odynophagia
  - respiratory distress
  - anosmia or dysgeusia

## Projects

- `kie-covid-19`: Is the implementation of this protocol using VSCode, Business Central and KIE Server
- `kogito-covid-19`: Is the implementation of this protocol using VSCode, Quarkus and Kogito Runtime.

Each project contains in `src/test/resources` two files that will let you query the REST API to test the information. It was made like that to show how can an external application can integrate with KIE Server and Kogito Runtime

## How to compile and run both projects?

For `kie-covid-19` you will need to execute `mvn clean install` to compile and install the project in local _.m2_ folder, and then if you want to deploy this on a kie server you will need to execute `mvn kieserver:deploy`.

For `kogito-covid-19` `mvn clean package` is needed to compile this, and if you want to run it with quarkus in developer mode you will need to execute `mvn quarkus:dev`.
