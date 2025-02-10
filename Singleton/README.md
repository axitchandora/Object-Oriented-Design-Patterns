# Singleton Pattern

## Problem Statement

You are developing software for an office with a single high-performance printer. This printer receives print requests from multiple computers, and it is crucial that all computers see the same queue state and printer status.

### Requirements:
1. Ensure all computers share a single queue.
2. Maintain a consistent printer state (e.g., online, offline, out of paper, print mode).
3. Ensure users cannot create multiple independent instances of the print service.
4. Any configuration changes (e.g., color mode) must be reflected for all users.
5. Implement a design that is resource-efficient and maintains consistency across all computers.

Your task is to implement the **Singleton Pattern** to ensure only one instance of the printer service exists.

## Example

**Input:**
```java
PrinterService worker1 = PrinterService.getInstance();
PrinterService worker2 = PrinterService.getInstance();

worker1.setMode("Color");
worker2.setMode("Grayscale");

System.out.println(worker1.getPrinterStatus());
System.out.println(worker2.getPrinterStatus());
```
**Output:**
```java
Mode changed to Color
Mode changed to Grayscale
Grayscale
Grayscale
```


## Constraints

1. Implement lazy initialization for efficiency.
2. Use thread safety to avoid race conditions.
3. Ensure a single global instance is accessible.

## Function Signature
```java
class PrinterService {
public static PrinterService getInstance();
public void setMode(String mode);
public String getPrinterStatus();
}
```

