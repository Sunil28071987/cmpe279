
SECTION .data

SECTION .bss

SECTION .text

global _start

_start:
	nop

	inc eax
	inc eax
	dec eax
	inc eax 

	mov eax, 1	; exit system call
	mov ebx, 0	; return code
	int 80H		; exit


      
