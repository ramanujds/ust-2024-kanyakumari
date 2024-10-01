const fetchGithubUser = require('./api-call');

test('fetchGithubUser returns user data', async () => {
    
    // Given
    const mockUsername = 'ramanujds';
    const mockResponse = { login: 'ramanujds', id: 1 };


    // When
    global.fetch = jest.fn().mockResolvedValue({
        json: jest.fn().mockResolvedValue(mockResponse)
    });

    // Then
    const data = await fetchGithubUser(mockUsername);

    expect(global.fetch).toHaveBeenCalledWith(`https://api.github.com/users/${mockUsername}`);
    expect(data).toEqual(mockResponse);
});