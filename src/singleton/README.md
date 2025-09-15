# 🟦 Singleton Design Pattern

> **Intent:**  
> Ensure a class has only **one instance**, and provide a **global point of access** to it.  

Although there can be many printers in a system, there should be only one **printer spooler**.  
The **Singleton** pattern guarantees that.

---

## ✅ Applicability
Use the Singleton pattern when:
- There must be exactly **one instance** of a class, and it must be accessible from a well-known access point.
- The sole instance should be **extensible by subclassing**, and clients should be able to use the extended instance without modifying their code.

---

## 👥 Participants

- **Singleton**
  - Defines an `Instance` operation that lets clients access its unique instance.  
    - (Class method in Smalltalk, `static` member function in C++/Java/C#)
  - May be responsible for creating its own unique instance.

- **Clients**
  - Access the Singleton instance **solely** through the `Instance` operation.

---

## 🔄 Collaborations
Clients interact with the Singleton **only** via the provided access method (`Instance`).  
This ensures a single point of control and prevents accidental multiple instantiations.

---

## 🎯 Consequences
The Singleton pattern has several benefits:

1. **Controlled access** to the sole instance  
   - The class encapsulates its instance, managing when and how it’s accessed.

2. **Reduced namespace pollution**  
   - Unlike global variables, Singletons provide a structured, object-oriented way of ensuring a single instance.

---

## 🔗 Related Patterns
- **Abstract Factory**  
- **Builder**  
- **Prototype**

These patterns often rely on Singleton to ensure a single shared instance is provided.

---

## 📝 Example (in Python)

```python
class Singleton:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Singleton, cls).__new__(cls)
        return cls._instance

# Usage
s1 = Singleton()
s2 = Singleton()

print(s1 is s2)  # True

