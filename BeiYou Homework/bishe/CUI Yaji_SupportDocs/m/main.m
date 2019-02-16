clear;clc;


%E 
%A=[0,1,2,1,2,3;3,0,1,4,5,2;2,3,0,3,4,1;3,4,1,0,1,2;2,3,4,3,0,1;1,2,3,2,3,0];
A=xlsread('data.xlsx','A');
E=1./A;
E(isinf(E)==1) = 0;
E
%A1=[4,1,2,1,2,3;3,4,1,4,5,2;2,3,4,3,4,1;3,4,1,4,1,2;2,3,4,3,4,1;1,2,3,2,3,4];
A1=xlsread('data.xlsx','A1');

%S
%C=[1,1,2,1,1,2;1,1,1,1,1,1;1,1,1,1,1,1;2,1,1,1,1,2;1,1,2,1,1,1;1,1,2,1,1,1];
C=xlsread('data.xlsx','C');
n=size(E,1);path1=zeros(n,n);
for i=1:n
    for j=1:n
        a= A1(i,j);
        b=0;
        for m=1:n
            if A1(i,m)==a
                b=b+C(i,m);
            end
        end
        path1(i,j)=C(i,j)/b;
        if i==j
            path1(i,j)=0;
        end
    end
end
S=path1;
S

%T
path2 =zeros(n,n);
for i=1:n
    for j=1:n
        a=A1(i,j);
        b=0;
        for m=1:n
            if A1(m,j)==a
                b=b+C(m,j);
            end
        end
        path2(i,j)=C(i,j)/b;
        if i==j
            path2(i,j)=0;
        end
    end
end
T=path2;
T

%M
B=[1,2,2;0,1,1;0,1,1];
n=size(B,1);B1=[];B2=zeros(n,n);
for i=1:n
    b=sum(B(i,:));
    B1=[B1 b];
end
R=max(B1)-min(B1);
for i=1:n
    for j=1:n
         b=power(9,(B1(i)-B1(j))/R);
         B2(i,j)=b;
    end
end
B3=prod(B2');
for i=1:n
    B4(i)=B3(i)^(1/R);
end
b=sum(B4);
for i=1:n
    B5(i)=B4(i)/b;
end
M=B5(1)*E+B5(2)*S+B5(3)*T;

%I
n=size(E,1);
for i=1:n
    I(i)=(1/(n-1))*(sum(E(i,:)));
end


%P
n=size(M,1);
for i=1:n
    for j=1:n
        P(i,j)=M(i,j)*I(i);
    end
end
P

%Sc  \lamda=0.8
lamda=0.8;
n=size(A,1);
%Sc_in=[1,1,2,1,1,2];
Sc_in=xlsread('data.xlsx','Sc_in');
%Sc_out=[2,1,1,2,1,1];
Sc_out=xlsread('data.xlsx','Sc_out');
for i=1:n
    Sc(i)=(lamda*Sc_in(i))+((1-lamda)*Sc_out(i));
end
Sc


%D
n=size(Sc,2);
X=sum(P);
for i=1:n
    D(i)=Sc(i)*X(i);
end
D

%D_
n=size(D,2);
Y=sum(D);
for i=1:n
    D_(i)=D(i)/Y;
end
D_

netplot(A,1);

fid = fopen('/Users/Richard/Desktop/m/node.txt','wt');

fprintf(fid,'%g\n',n);      

fclose(fid);

order = fopen('/Users/Richard/Desktop/m/order.txt','wt');

fprintf(order,'%g\n',D_);      

fclose(order);





        






                
        
        