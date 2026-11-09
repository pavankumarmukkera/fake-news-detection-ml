# Power Platform extension design: Human review of machine-learning classifications

> **Status: concept / portfolio learning exercise.** This document is not an exported or deployed Power Apps app, Power Automate flow, Dataverse solution or Power BI report. The original project remains in its existing technology stack.

## Why this fits the original project

This proposed extension adds a business workflow related to **Human review of machine-learning classifications**. It is intended to complement the existing repository rather than rebrand its original implementation.

## Suggested Microsoft technology

Power Apps + SharePoint

## Proposed data model (illustrative)

Data fields: ArticleReference, PredictedLabel, Confidence, Reviewer, ReviewDecision, ReviewedAt

Create an appropriately secured SharePoint list or Dataverse table (as applicable), choose proper field types, and test access permissions. Do not use real employee, customer, patient or security incident details in demos.

## Automation idea

Notify reviewers when a classification needs validation

Suggested approach: choose a suitable trigger, validate input, add conditions, record outcomes, handle failures, and notify the responsible role. This is a workflow outline, **not a deployable cloud flow**.

## Analytics question

Human-review agreement rate

Use synthetic or authorised data to demonstrate the metric. A Power BI report would need to be built and exported separately.

## Suggested implementation checklist

- [ ] Confirm requirements and data-access permissions
- [ ] Create sample data with no personal information
- [ ] Build and test the appropriate Power Apps screen or Power BI report
- [ ] Configure and test the Power Automate workflow if applicable
- [ ] Capture real screenshots and document test cases
- [ ] Export and review authentic solution files before publishing

## Current evidence

This is **project-specific design documentation only**. See the original repository for its real source code and existing artefacts.