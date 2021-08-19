% Prolog: programming in logic
% SWI-Prolog

% closed-world hypothesis: the file (database)
% defines everything that is true.  Anything else
% is false.

% isInteger/1 procedure - arity 1
% arity: number of parameters to the procedure
isInteger(0). % fact
isInteger(1). % fact
isInteger(2). % fact


% isInteger/2 procedure - arity 2
isInteger(0, 1).
isInteger(0, 2).
isInteger(1, 2).
isInteger(4, 3).


% isName/1 procedure
% alice and bob are atoms
% atom is basically a string
% atoms start with a lowercase letter
isName(alice).
isName(bob).

