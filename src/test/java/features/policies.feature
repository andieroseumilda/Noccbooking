
Feature: Check policies

    Scenario: Create public early reservation, DWH Full Refundable LT
      Given Guest selects an early modification and cancellation from 2 days from now to 4 days from now
      When guest see the policies in step 2
      Then guest should see this prepayment policy copy "Prepayment: Full prepayment is required to confirm your reservation."
#      And sees the policies in popover
#      And the modification in policy blurb is "Prepayment: Full prepayment is required to confirm your reservation. Cancellation: If you choose to cancel, you will be charged 30% of the total room charges. Modification: If you choose to modify, you will be charged 30% of the total room charges. No-show: Guests who do not arrive within 24 hours of the check-in date and time of the hotel will be charged 30% of the total room cost of the reservation."
#      And the cancellation in policy blurb is "Cancellation: If you choose to cancel, you will be charged 30% of the total room charges."
#      And the no show in policy blurb "No-show: Guests who do not arrive within 24 hours of the check-in date and time of the hotel will be charged 30% of the total room cost of the reservation."
      And modification policy copy is "Modification: If you choose to modify, you will be charged 30% of the total room charges."
      And cancellation policy copy is "Cancellation: If you choose to cancel, you will be charged 30% of the total room charges."
      And no show policy copy is "No-show: Guests who do not arrive within 24 hours of the check-in date and time of the hotel will be charged 30% of the total room cost of the reservation."
      And refund policy copy is "Refund Policy: Your prepayment will be refunded if you cancel before the cancellation due date. If you cancel past the cancellation due date, you may be charged a cancellation fee as indicated in the cancellation policy, and this will be deducted from the amount refunded."
      And credit card control copy is "Card Fraud Control: To protect credit card owners from fraud, the guest is required to present the actual credit card used in making the online booking and a valid government issued PHOTO ID of the card owner upon check-in. The hotel reserves the right to refuse the guest to check-in for failure to comply with this requirement. If the card owner is not the one staying at the hotel, the guest is required to present clear photocopies of the front and back of the credit card used, a valid government issued photo ID of the card owner along with an authorization letter stating that the credit card holder has allowed the guest to use his/her card for the reservation. The hotel may cancel a confirmed reservation if a booking is suspected to be made using a fraudulent credit card."
      And sees the policies in popover
      And guest should select 1 room and redirect to step 3
      And guest should see this prepayment policy copy "Prepayment: Full prepayment is required to confirm your reservation."
      And modification policy copy is "Modification: If you choose to modify, you will be charged 30% of the total room charges."
      And cancellation policy copy is "Cancellation: If you choose to cancel, you will be charged 30% of the total room charges."
      And no show policy copy is "No-show: Guests who do not arrive within 24 hours of the check-in date and time of the hotel will be charged 30% of the total room cost of the reservation."
      And refund policy copy is "Refund Policy: Your prepayment will be refunded if you cancel before the cancellation due date. If you cancel past the cancellation due date, you may be charged a cancellation fee as indicated in the cancellation policy, and this will be deducted from the amount refunded."
      And credit card control copy is "Card Fraud Control: To protect credit card owners from fraud, the guest is required to present the actual credit card used in making the online booking and a valid government issued PHOTO ID of the card owner upon check-in. The hotel reserves the right to refuse the guest to check-in for failure to comply with this requirement. If the card owner is not the one staying at the hotel, the guest is required to present clear photocopies of the front and back of the credit card used, a valid government issued photo ID of the card owner along with an authorization letter stating that the credit card holder has allowed the guest to use his/her card for the reservation. The hotel may cancel a confirmed reservation if a booking is suspected to be made using a fraudulent credit card."
#      And check the policies on the policy blurb
      And guest should see this prepayment policy copy "Prepayment: Full prepayment is required to confirm your reservation." on the policies blurb in step 3
      And modification policy copy is "Modification: If you choose to modify, you will be charged 30% of the total room charges." on the policies blurb in step 3
      And cancellation policy copy is "Cancellation: If you choose to cancel, you will be charged 30% of the total room charges." on the policies blurb in step 3
      And no show policy copy is "No-show: Guests who do not arrive within 24 hours of the check-in date and time of the hotel will be charged 30% of the total room cost of the reservation." on the policies blurb in step 3