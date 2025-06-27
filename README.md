# JTrello

JTrello is a 'in development' Java wrapper for Trello. It is based on the very nice wrapper [Chello](https://bitbucket.org/mrshrinkray/chello/wiki/Home/).

I will try to put speed on this!

[Download](https://bitbucket.org/asommariva/jtrello/downloads) the latest version.

## Dependencies

You need this Jars:

* asm-3.3.1.jar
* jersey-bundle-1.17.jar
* commons-lang3-3.1.jar
* gson-2.2.2.jar

## Using the client

Here's an example of some Java code:

```
#!java
    JTrelloClient client = new JTrelloClient("TRELLO_API_KEY", null);
```

or 

```
#!java
    JTrelloClient client = new JTrelloClient("TRELLO_API_KEY", "TRELLO_SECRET_KEY", "TRELLO_USER_TOKEN");
```

Replace the following properties values with your own, in 'test/resources/testvalues.properties' to run the tests:

```
#!java
    TRELLO_API_KEY="";
    TRELLO_SECRET_KEY="";
    TRELLO_USER_TOKEN="";

```

## Getting data

```
#!java
    Member member = client.getMembers().get("me");
    List<Board> boards = client.getBoards().getByUser("me");
    
```

Take a look at the tests for more code.


# News

### Version 0.0.3

Added methods to create: Organizations, boards, lists, cards and checklists.

### Version 0.0.2

Added queries for: lists, checklists, actions, and notifications.

### Version 0.0.1

Very low functionality, only query for: members, organizations, boards and cards.

# API implementation

See which methods are implemented in JTrello API wrapper and where: [API implementation](/API.md).
