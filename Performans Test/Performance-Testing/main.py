from locust import HttpUser, between, task


class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

    @task
    def get_user_info(self):
        self.client.get("/v2/user/batuselek")

    @task
    def get_status_available_pet(self):
        self.client.get("/v2/pet/findByStatus?status=available")

    @task
    def create_pet(self):
        payload_Pet = {
            "id": 789456,
            "category": {
                "id": 456123,
                "name": "Evcil Hayvanlar"
            },
            "name": "Golden Retriever",
            "photoUrls": [
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Ftr.m.wikipedia.org%2Fwiki%2FDosya%3AGolden_Retriever_with_tennis_ball.jpg&psig=AOvVaw0JFvZ2GXGG0QJl-cyn50lo&ust=1741099775850000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPCVu6CU7osDFQAAAAAdAAAAABAE"
            ],
            "tags": [
                {
                    "id": 123456,
                    "name": "Köpek"
                }
            ],
            "status": "available"
        }
        self.client.post("/v2/pet", json=payload_Pet)

    @task
    def create_user(self):
        payload_User = {
            "id": 789456,
            "username": "batuselek",
            "firstName": "Batuhan",
            "lastName": "Selek",
            "email": "batuselek@gmail.com",
            "password": "1234",
            "phone": "5554443322",
            "userStatus": 2
        }
        self.client.post("/v2/user", json=payload_User)

    @task
    def user_delete(self):
        self.client.delete("/v2/user/batuselek")

    @task
    def user_update(self):
        payload_Update_User = {
            "id": 159951,
            "username": "begumyangın",
            "firstName": "Begüm",
            "lastName": "Yangın",
            "email": "begumyangin@gmail.com",
            "password": "4321",
            "phone": "5553332211",
            "userStatus": 4
        }
        header_payload = {
            "accept": "application/json",
            "Content-Type": "application/json"
        }
        self.client.put("/v2/user/batuselek", json=payload_Update_User, headers=header_payload)

    @task
    def pet_update(self):
        payload_Update_Pet = {
            "id": 147963,
            "category": {
                "id": 963741,
                "name": "Köpekler"
            },
            "name": "Labrador Retriever",
            "photoUrls": [
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FLabrador_Retriever&psig=AOvVaw14pJ3z5NtdbxIjiamlhCZz&ust=1741100810444000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJiztI2Y7osDFQAAAAAdAAAAABAE"
            ],
            "tags": [
                {
                    "id": 852741,
                    "name": "Evcil Hayvan"
                }
            ],
            "status": "available"
        }
        header_payload_pet = {
            "accept": "application/json",
            "Content-Type": "application/json"
        }
        self.client.put("/v2/pet", json=payload_Update_Pet, headers=header_payload_pet)
