import { Card, Container } from 'react-bootstrap';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

function Register() {
  return (
    
    <Card className='my-3'>

            <Card.Header>Register</Card.Header>
            <Container>
                <Form>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>Email</Form.Label>
                        <Form.Control name="email"  type="text" placeholder="Email"/>
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control name="password" type="password" placeholder="Password" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>Confirm Password</Form.Label>
                        <Form.Control name="confirm" type="password" placeholder="Confirm Password" />
                    </Form.Group>

                    <Button variant="primary" type="submit" className='my-3'>
                        Submit
                    </Button>
                    <Button variant="primary" type="submit" className='my-3'>
                        Submit
                    </Button>
                </Form>
            </Container>
            <Card.Footer>Thank You</Card.Footer>
        </Card>
  );
}

export default Register;