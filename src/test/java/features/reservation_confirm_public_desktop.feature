Feature: Create Public Confirm Reservation

  Scenario: Create public confirm reservation, DWH Full Refundable
    Given Guest selects an early modification and cancellation from 8 days from now to 10 days from now
    When guest select 2 room/s on Full Refundable LT
    Then guest should be able to book a reservation




