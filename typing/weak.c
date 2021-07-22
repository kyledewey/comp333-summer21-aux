#include "stdio.h"

// C: weakly typed
int main() {
  /* int* p;   */
  /* int x = *p; */

  // undefined behavior
  int arr[] = {1, 2, 3};
  printf("%i\n", arr[10]);

  return 0;
}

