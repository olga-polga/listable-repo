# listable-repo
Using Spring Data REST

## Run with local MySQL:
```
mvn -Drun.profiles=local  spring-boot:run
```
## Run with H2:
```
mvn -Drun.profiles=h2  spring-boot:run
```

## Open local instance with HAL browser:
```
http://localhost:9001/api/browser
```

## Deploy to GCP:
```
mvn appengine:deploy
```
