### Cloud Computing Overview

Cloud computing allows users to access computing resources on-demand via the internet without having to manage physical infrastructure. Key cloud providers include:

- **AWS (Amazon Web Services)**
- **Azure (Microsoft Azure)**
- **GCP (Google Cloud Platform)**

### Key Concepts in AWS

#### **Region and Availability Zone**
- **Region**: A geographical area containing multiple data centers known as Availability Zones (AZs). Each region is isolated and independent.
- **Availability Zone**: Distinct locations within a region designed to be isolated from failures in other zones.

#### **IP Addresses**
- **IPv4**: A 32-bit address (e.g., 192.168.1.1) used for identifying devices on a network.
- **IPv6**: A 128-bit address designed to address the limitations of IPv4, allowing for a much larger address space.

#### **Subnet**
A subnet is a segmented piece of a larger network (typically within a Virtual Private Cloud). Subnets allow you to create smaller, isolated networks.
- **255.255.255.255**: Broadcast address in an IPv4 network.
- **0.0.0.0**: Refers to any IP address, often used as a default route.

#### **VPC (Virtual Private Cloud)**
A VPC is a virtual network dedicated to your AWS account, allowing you to launch AWS resources into a virtual network that you define.

#### **Subnets**
Subnets within a VPC divide the IP address range into smaller networks to control traffic routing and resource accessibility. 
- **Public Subnet**: Directly accessible from the internet.
- **Private Subnet**: Accessible only through internal networks (no direct internet access).

#### **Security Group**
A security group acts as a virtual firewall for your EC2 instances to control inbound and outbound traffic.
- **Inbound Rules**: Control the incoming traffic to your instance.
- **Outbound Rules**: Control the outgoing traffic from your instance.

### Cloud Deployment Models
There are three primary cloud models:
- **Private Cloud**: Cloud infrastructure is used exclusively by one organization.
- **Public Cloud**: Infrastructure is available to the general public or a large industry group.
- **Hybrid Cloud**: A combination of private and public cloud infrastructures.

### Cloud Service Models

1. **IaaS (Infrastructure as a Service)**
   - Provides virtualized computing resources over the internet.
   - Examples: 
     - **AWS**: EC2 (Elastic Compute Cloud)
     - **Azure**: VM (Virtual Machines)
     - **GCP**: Compute Engine (CE)

2. **PaaS (Platform as a Service)**
   - Provides hardware and software tools over the internet, typically for application development.
   - Example: AWS Elastic Beanstalk

3. **SaaS (Software as a Service)**
   - Delivers software applications over the internet, typically on a subscription basis.
   - Examples: Gmail, Salesforce

### How to Start Your First EC2 Instance

1. **Browse EC2 Service**: In the AWS Management Console, search for and select EC2.
2. **Click "Launch Instance"**: Follow the prompts to configure your instance (select AMI, instance type, configure networking, etc.).
3. **Connect to your EC2 instance**: After launching, you can connect to your EC2 instance using SSH.

### Example Command to Upload Files to EC2 Instance
To upload a file from your local machine to your EC2 instance:
```bash
scp -i "key-file-name.pem" file-to-upload ec2-user@public-ip-address:/home/ec2-user
```
Example:
```bash
scp -i "ust-ec2-key.pem" trainee-app.jar ec2-user@54.147.170.59:/home/ec2-user
```

### Install Java on EC2 Instance
Install Java (Amazon Corretto 21) on your EC2 instance:
```bash
sudo yum install java-21-amazon-corretto-headless
```

### Install Maven on EC2
To build Java applications, install Maven:
```bash
sudo yum install maven -y
```

### Install Git on EC2
To manage repositories, install Git:
```bash
sudo yum install git -y
```

### Clone the Repository and Build the Jar
1. **Clone your Git repository** to the EC2 instance.
2. **Navigate to the project directory**.
3. Run the following Maven command to build your project into a `.jar` file:
   ```bash
   mvn clean install
   ```
   Make sure you're in the correct project folder.

### Running the Application

1. **Go to the target folder** where the `.jar` file is generated.
2. Run the application using:
   ```bash
   java -jar [file-name.jar]
   ```

### Update Security Group Inbound Rules

To allow access to your application, make sure to update the inbound rule in your EC2 security group to allow traffic on the port your application is running:
- Add a custom TCP rule for the specific port from anywhere (e.g., `0.0.0.0/0`).
