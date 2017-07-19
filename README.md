# SpringAOPExample

Basically Aspect oriented programming complements object oriented programming by providing another way of programming model structure.
In addition to classes, AOP gives you aspect, which enables modularization of concerns such as Transaction management or logging and can be separated 
out from the application business logic of the code (these kinds of concerns are termed as crosscutting concerns). 
AOP supports separating application business logic from System services.

In Spring AOP, 4 type of advices are supported :</p>

	Before advice – Run before the method execution
	After returning advice – Run after the method returns a result
	After throwing advice – Run after the method throws an exception
	Around advice – Run around the method execution, combine all three advices above.
