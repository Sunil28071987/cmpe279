
SECTION .data

SECTION .text

global _start

_start:
	nop


	nop

 	mov eax, 1      ; exit system call
        mov ebx, 0      ; return code
        int 80H         ; exit

SECTION .bss

      
