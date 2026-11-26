# Exercise 42: Implement regression testing for a content management system after updates

**Type:** Manual

## Aim

To implement regression testing for a content management system after updates. Regression testing confirms that a change (a new feature, a fix or a patch) has not damaged the functions that were working earlier.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| System under test | Content management system after the update from the old version to the new version |
| Changes in the update | New editor, security patch for the login, updated theme and SEO plug-in |
| Source of the test cases | Existing test suite of the previous version |
| Technique | Impact analysis to select the regression test cases |

## Algorithm

**Step 1:** Start and identify the changes made in the update of the content management system (new version of the editor and a security patch).

**Step 2:** Select the existing test cases that cover the changed modules and the modules that depend on them (impact analysis).

**Step 3:** Give a priority to every selected test case: High (critical function), Medium or Low, so that the High cases are executed first if the time is short.

**Step 4:** Execute the selected test cases on the updated system and compare the results with the results of the earlier version.

**Step 5:** Do the impact analysis: list every change of the update, find the modules that depend on it and rate the risk of the regression of every module.

**Step 6:** Execute the high priority test cases first, compare the results with the results of the old version and report every difference as a regression defect.

**Step 7:** Report every failed test case as a regression defect, retest it after the fix and stop.

## Test Cases / Document

***Impact analysis of the update***

| **Changed component** | **Impacted modules** | **Risk** |
| --- | --- | --- |
| Editor (new version) | Pages, media library, publishing | High |
| Security patch for the login | Login, user roles, password reset | High |
| Theme update | Front-end pages, menus | Medium |
| SEO plug-in update | Page meta tags, sitemap | Medium |
| Unchanged modules | Search, comments | Low (sample check) |

***Regression test suite***

| **TC ID** | **Module** | **Test description** | **Priority** | **Reason for selection** | **Status** |
| --- | --- | --- | --- | --- | --- |
| RG01 | Login | Login with a valid administrator | High | Security patch | Pass |
| RG02 | Login | Wrong password is rejected | High | Security patch | Pass |
| RG03 | Editor | Create a page with text and image | High | Editor updated | Pass |
| RG04 | Editor | Save and reopen a page | High | Editor updated | Pass |
| RG05 | Media library | Upload and delete an image | Medium | Depends on the editor | Fail |
| RG06 | Publishing | Publish and unpublish a page | High | Depends on the editor | Pass |
| RG07 | User roles | Editor role cannot delete a user | Medium | Security patch | Pass |
| RG08 | Search | Search for a published page | Low | Not changed (sample check) | Pass |
| RG09 | Comments | Add and approve a comment | Medium | Depends on the editor | Fail |
| RG10 | Backup | Take a backup and restore it | High | Security patch | Pass |

***Test execution summary (fill after the execution of the regression test cases)***

| **Total designed** | **Executed** | **Passed** | **Failed** | **Blocked** | **Pass %** |
| --- | --- | --- | --- | --- | --- |
| 10 | 10 | 8 | 2 | 0 | 80 % |

***Regression defect log***

| **Defect Id** | **Test case** | **Description** | **Severity** | **Status** |
| --- | --- | --- | --- | --- |
| DEF-01 | RG05 | Image is not deleted from the media library after the Delete action | Major | Open |
| DEF-02 | RG09 | Approved comment is displayed twice on the page | Minor | Open |

## Result

Thus the regression testing of the content management system was executed after the update and the output was verified. The changed modules and the modules that depend on them were retested.
