# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * **if (grade%10==7 || grade%10==8 || grade%10==9) {
        status+="+";
      }
      else if (grade%10==0 ||grade%10==1 ||grade%10==2) {
        status+="-";
      } **


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * **YOUR WRITING HERE**


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * **YOUR WRITING HERE**
