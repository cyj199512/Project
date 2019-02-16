clear;clc;
%A
A1=unidrnd(10,5,5);
n=size(A1,1);
A=A1;
for i=1:n
    for j=1:n
        if (i==j)
            A(i,j)=0;
        end
    end
end
%xlswrite('data1.xlsx',A,'A');
%xlswrite('data1.xlsx',A1,'A1');

%B
B=unidrnd(2,5,5);
%xlswrite('data1.xlsx',B,'B');
%Sc_in
Sc_in=unidrnd(25,1,5);
%xlswrite('data1.xlsx',Sc_in,'Sc_in');


%Sc_out
Sc_out=unidrnd(25,1,5);
%xlswrite('data1.xlsx',Sc_out,'Sc_out');
