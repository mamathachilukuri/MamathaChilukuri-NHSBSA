$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("endtoend.feature");
formatter.feature({
  "line": 2,
  "name": "NHS Costs checker End to End journey",
  "description": "\r\nAs a person from Wales\r\nI need to know what help I can get with my NHS costs\r\nSo that I can get the treatment I need",
  "id": "nhs-costs-checker-end-to-end-journey",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EndToEnd"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I put my \"\u003cage\u003e\" circumstances into the Checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I should get a \"\u003cage\u003e\" result of whether I will get help or not",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria;",
  "rows": [
    {
      "cells": [
        "age"
      ],
      "line": 17,
      "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria;;1"
    },
    {
      "cells": [
        "18 to 24"
      ],
      "line": 18,
      "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria;;2"
    },
    {
      "cells": [
        "25 to 60"
      ],
      "line": 19,
      "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8606675381,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I am a person from Wales",
  "keyword": "When "
});
formatter.match({
  "location": "EndToEndJourney.I_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 1560402281,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 2067080834,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I put my \"18 to 24\" circumstances into the Checker tool",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I should get a \"18 to 24\" result of whether I will get help or not",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "18 to 24",
      "offset": 10
    }
  ],
  "location": "EndToEndJourney.I_put_my_circumstances_into_the_Checker_tool(String)"
});
formatter.result({
  "duration": 6758645592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18 to 24",
      "offset": 16
    }
  ],
  "location": "EndToEndJourney.I_should_get_a_result_of_whether_I_will_get_help_or_not(String)"
});
formatter.result({
  "duration": 59784622,
  "status": "passed"
});
formatter.write("Current page urlhttps://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4057821082,
  "status": "passed"
});
formatter.before({
  "duration": 9552189843,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I am a person from Wales",
  "keyword": "When "
});
formatter.match({
  "location": "EndToEndJourney.I_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 1384543973,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 817873667,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I put my \"25 to 60\" circumstances into the Checker tool",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I should get a \"25 to 60\" result of whether I will get help or not",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "25 to 60",
      "offset": 10
    }
  ],
  "location": "EndToEndJourney.I_put_my_circumstances_into_the_Checker_tool(String)"
});
formatter.result({
  "duration": 8396975058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25 to 60",
      "offset": 16
    }
  ],
  "location": "EndToEndJourney.I_should_get_a_result_of_whether_I_will_get_help_or_not(String)"
});
formatter.result({
  "duration": 32058549,
  "status": "passed"
});
formatter.write("Current page urlhttps://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 3626654593,
  "status": "passed"
});
formatter.before({
  "duration": 9318947573,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I am a person from Wales",
  "keyword": "When "
});
formatter.match({
  "location": "EndToEndJourney.I_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 2534869270,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 1185582703,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I put my under 16 circumstances into the Checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I should get a under 16 result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EndToEndJourney.I_put_my_under_16_circumstances_into_the_checker_tool()"
});
formatter.result({
  "duration": 406569297,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.I_should_get_a_under_16_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 223039703,
  "status": "passed"
});
formatter.write("Current page urlhttps://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-under-16");
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 69437037514,
  "status": "passed"
});
formatter.before({
  "duration": 7964334864,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I am a person from Wales",
  "keyword": "When "
});
formatter.match({
  "location": "EndToEndJourney.I_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 1573632963,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 2206020961,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I put my over 60 circumstances into the Checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I should get a over 60 result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EndToEndJourney.I_put_my_over_60_circumstances_into_the_Checker_tool()"
});
formatter.result({
  "duration": 2843042801,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.I_should_get_a_over_60_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 45427784,
  "status": "passed"
});
formatter.write("Current page urlhttps://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-council-help-care-home");
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 69092380123,
  "status": "passed"
});
formatter.before({
  "duration": 7837074275,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I am a person from Wales",
  "keyword": "When "
});
formatter.match({
  "location": "EndToEndJourney.I_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 1267051164,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 1393399260,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "nhs-costs-checker-end-to-end-journey;wales-test-ticket---acceptance-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "I put my pregnant circumstances into the Checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I should get a pregnant result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EndToEndJourney.I_put_my_pregnant_circumstances_into_the_Checker_tool()"
});
formatter.result({
  "duration": 5896694685,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndJourney.I_should_get_a_pregnant_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 53782974,
  "status": "passed"
});
formatter.write("Current page urlhttps://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result");
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 68355143130,
  "status": "passed"
});
});