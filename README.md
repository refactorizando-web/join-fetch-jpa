# Join Fetch in JPA with Spring Data

## Introduction 

Many times the first approach to improve the performance of our applications 
is checking the relations and queries between tables. 

One of the most common mistakes is the problem of 
n + 1 query. This issue appears when we are not 
taking control over our queries and relationships. One of 
the approaches to avoid this is use Join Fetch in 
our relationships. 

If you want more information you can take a peek in this
article: https://refactorizando.com/join-fetch-jpa-spring-data

## Example

In this example we have two different approaches
to get info from database. 

### Without Join Fetch
In this case we are going to produce n+1 query, in our example two queries. 


### With Join Fetch. 

In this case we are going to generate just one query.

## How does it run?

    mvn test

